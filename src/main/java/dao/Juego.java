package dao;

/**
 * @author Steven
 */
public class Juego {

    char juego[][] = new char[3][3];

    public boolean validaturno() {
        if (linea()) {
            return true;
        } else if(columna()){
            return true;
        }else if(diagonal()){
            return true;
        }else{
            return false;
        }
    }

    public boolean linea() {

        if ((juego[0][0] == 'X' && juego[0][1] == 'X' && juego[0][2] == 'X') || (juego[0][0] == 'O' && juego[0][1] == 'O' && juego[0][2] == 'O')) {
            return true;
        } else if ((juego[1][0] == 'X' && juego[1][1] == 'X' && juego[1][2] == 'X') || (juego[1][0] == 'O' && juego[1][1] == 'O' && juego[1][2] == 'O')) {
            return true;
        } else if ((juego[2][0] == 'X' && juego[2][1] == 'X' && juego[2][2] == 'X') || (juego[2][0] == 'O' && juego[2][1] == 'O' && juego[2][2] == 'O')) {
            return true;
        } else {
            return false;
        }
    }

    public boolean columna() {
        if ((juego[0][0] == 'X' && juego[1][0] == 'X' && juego[2][0] == 'X') || (juego[0][0] == 'O' && juego[1][0] == 'O' && juego[2][0] == 'O')) {
            return true;
        } else if ((juego[0][1] == 'X' && juego[1][1] == 'X' && juego[2][1] == 'X') || (juego[0][1] == 'O' && juego[1][1] == 'O' && juego[2][1] == 'O')) {
            return true;
        } else if ((juego[0][2] == 'X' && juego[1][2] == 'X' && juego[2][2] == 'X') || (juego[0][2] == 'O' && juego[1][2] == 'O' && juego[2][2] == 'O')) {
            return true;
        } else {
            return false;
        }

    }
    
    public boolean diagonal(){
        if((juego[0][0] == 'X' && juego[1][1] == 'X' && juego[2][2] == 'X' ) ||(juego[0][0] == 'O' && juego[1][1] == 'O' && juego[2][2] == 'O' ) ){
            return true;
        }else if((juego[0][2] == 'X'&& juego[1][1] == 'X' && juego[2][0] == 'X') || (juego[0][2] == 'O'&& juego[1][1] == 'O' && juego[2][0] == 'O')){
            return true;
        }else{
            return false;
        }
    };
;

}
