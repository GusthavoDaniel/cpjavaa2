package dao;

import model.Seguro;
import java.util.ArrayList;
import java.util.List;

public class SeguroDAOImpl implements SeguroDAO {
    private List<Seguro> seguros = new ArrayList<>();

    @Override
    public void cadastrarSeguro(Seguro seguro) {
        seguros.add(seguro);
    }

    @Override
    public Seguro buscarSeguro(String tipo) {
        return seguros.stream()
                .filter(s -> s.getTipo().equals(tipo))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Seguro> listarSeguros() {
        return new ArrayList<>(seguros);
    }
}
