/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author 182120069
 */
public class DAOFactory {

    private static PessoaDAO pDAO = new PessoaDAO();

    public static PessoaDAO getPessoaDAO() {
        return pDAO;
    }

    private static CarroDAO cDAO = new CarroDAO();

    public static CarroDAO getCarroDAO() {
        return cDAO;
    }
}
