public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static{
        try{
            instance = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException("Error instantiating static block singleton");
        }
    }

}
