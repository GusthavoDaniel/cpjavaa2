package dao;

import model.Seguro;
import java.util.List;

public interface SeguroDAO {
    void cadastrarSeguro(Seguro seguro);
    Seguro buscarSeguro(String tipo);
    List<Seguro> listarSeguros();
}
