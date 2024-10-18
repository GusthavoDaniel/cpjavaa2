package service;

import dao.SeguroDAO;
import model.Seguro;
import java.util.List;

public class SeguroService {
    private static SeguroService instance;
    private SeguroDAO seguroDAO;

    private SeguroService(SeguroDAO seguroDAO) {
        this.seguroDAO = seguroDAO;
    }

    public static SeguroService getInstance(SeguroDAO seguroDAO) {
        if (instance == null) {
            instance = new SeguroService(seguroDAO);
        }
        return instance;
    }

    public void cadastrarSeguro(Seguro seguro) {
        seguroDAO.cadastrarSeguro(seguro);
    }

    public Seguro buscarSeguro(String tipo) {
        return seguroDAO.buscarSeguro(tipo);
    }

    public List<Seguro> listarSeguros() {
        return seguroDAO.listarSeguros();
    }
}
