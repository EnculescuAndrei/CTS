package ro.ase.acs.decorator;


interface DataService{
    String fetchData();
}

class DataServiceConcrete implements DataService{
    public String fetchData(){
        return "Data";
    }
}
class LoggingDecorator implements DataService{
    private DataService wrapper;
    LoggingDecorator(DataService wrapper){
        this.wrapper= wrapper;
    }

    public String fetchData(){
        System.out.println("Fetching data...");
        return wrapper.fetchData();
    }
}

public class Exemple1 {
    public static void main(String[] args) {
        DataService myDataService = new LoggingDecorator(new DataServiceConcrete());
        System.out.println(myDataService.fetchData());

        DataService realDataService = new DataServiceConcrete();

        DataService loggedDataService= new LoggingDecorator(realDataService);

        String data = loggedDataService.fetchData();
        System.out.println("Data retrieved: "+ data);
    }
}
