import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Holla {

    public static void main(String[] args) {
        System.out.println("Olá, mundo! " );

            Date date=new Date(  );

        System.out.println("a hora do sistema é:" );
        System.out.println(date.toString() );

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("resolução da pagina width:"+d.width );
        System.out.println( "resolução da pagina height:"+d.height);

        Locale loc =Locale.getDefault();
        System.out.println(loc.getDisplayLanguage() );
        System.out.println(loc.getLanguage() );






    }



}
