package Aula22.Apresentacao;

import Aula22.Negocio.ItemMenu;
import Aula22.Negocio.MaquinaSorvete;
import Aula22.Persistencia.MaquinaSorveteDao;

/**
 * @author ErikVergani
 * @date 09/05/2021
 **/

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        MaquinaSorveteDao maquinaSorveteDao = new MaquinaSorveteDao();
        MaquinaSorvete maquinaSorvete = maquinaSorveteDao.read();

        if (maquinaSorvete == null) {
            maquinaSorvete = new MaquinaSorvete();
        }
        menu.addItem(new ItemMenu("Menu Cliente", new MenuUser(maquinaSorvete), 1));
        menu.addItem(new ItemMenu("Menu Proprietario", new MenuProp(maquinaSorvete), 2));
        menu.gerarMenu();

        maquinaSorveteDao.save(maquinaSorvete);
        System.exit(0);

    }
}
