package Amadeo.designPatterns.TOP;

public class ProviderProgram {
    public static void main(String[] args) {
//        ProviderBO providerBO = new ProviderBO();
//        //CRUD: Create, Read, Update, Delete
//
//        //print all providers
//        providerBO.printProvidersBD();
//
//        //delete provider by Employee Code
//        providerBO.deleteByEmpCode("ma.Arcor345");
//        //Update missing

        //**************************************************************************************************************

        Provider provider = new Provider();
        System.out.println("Protejida "+ provider.company );
        System.out.println("Publica "+ provider.name );
        System.out.println("Default "+ provider.empCode);

        System.out.println("***********************************************************");

        provider.company = "laskdjf";
        provider.name = "Mariano";
        provider.empCode= "928374";
        System.out.println("Protejida "+ provider.company );
        System.out.println("Publica "+ provider.name );
        System.out.println("Default "+ provider.empCode);

        System.out.println("Privada " + provider.getDni());

    }
}
