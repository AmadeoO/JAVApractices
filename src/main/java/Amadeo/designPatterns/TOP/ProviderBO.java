package Amadeo.designPatterns.TOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProviderBO {
    private List<Provider> listProvider;

    public ProviderBO() {
        this.listProvider = new ArrayList<Provider>();
        Provider juan = new Provider("Juan", "Coca-cola", "j.Coca123");
        Provider mariano = new Provider("Mariano", "Arcor", "ma.Arcor345");
        Provider fernando = new Provider("Fernando", "Sancor", "fer.San147");
        listProvider.add(juan);
        listProvider.add(mariano);
        listProvider.add(fernando);
    }

    public void deleteByEmpCode(String empCode){
        Provider provider = getProviderByEmpCode(empCode);
        this.listProvider.remove(provider);
        System.out.println("Provider -> name: "+provider.getName()+" codeEmployee: "+provider.getEmpCode()+" was DELETED");
        printProvidersBD();
    }

    public List<Provider> getAllProvider(){
        return listProvider;
    }

    public Provider getProviderByEmpCode(String empCode) {
        try{
            for(Provider pr : getAllProvider()){
                if (Objects.equals(pr.getEmpCode(), empCode)){
                    return pr;
                }
            }
        } catch (NullPointerException ex){
            throw new NullPointerException("The provider "+empCode+" no founded");
        }
        return null;
    }

    public void printProvidersBD(){
        System.out.println("Providers");
        System.out.println("****************************");
        for(Provider pr : getAllProvider()){
            System.out.println("");
            System.out.println("Name: "+pr.getName());
            System.out.println("Company: "+ pr.getCompany());
            System.out.println("Employee Code: "+ pr.getEmpCode());
            System.out.println("");
            System.out.println("****************************");
        }
    }



}
