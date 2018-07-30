package lt.baltictalents.string;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringCreator().create( "labas", "rytas" ));
        System.out.println(new StringCreator().create( null, "rytas" ));
        System.out.println(new StringCreator().create( null, null ));
        System.out.println(new StringCreator().create( "", "" ));
        System.out.println(new StringCreator().create( "", "rytas" ));

        System.out.println("-----------------------------------------------------");

        System.out.println(new StringCreator().create( "labas", "rytas", "visi" ));
        System.out.println(new StringCreator().create( null, "rytas", "visi" ));
        System.out.println(new StringCreator().create( null, null, "visi" ));
        System.out.println(new StringCreator().create( "", "", null ));
        System.out.println(new StringCreator().create( "", "rytas", "" ));
    }
}
