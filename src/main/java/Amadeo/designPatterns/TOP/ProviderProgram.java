package Amadeo.designPatterns.TOP;

public class ProviderProgram {
    public static void main(String[] args) {
        ProviderBO providerBO = new ProviderBO();

        //print all providers
        providerBO.printProvidersBD();

        //delete provider by Employee Code
        providerBO.deleteByEmpCode("ma.Arcor345");

        //Update missing
    }
}
