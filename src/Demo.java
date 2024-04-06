import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Demo {

	// é a classe de demonstração, então tudo é reunido aqui.
	
    public static void main(String[] args) {
        Director director = new Director();

        
        // O diretor consegue pegar o builder do objeto pelo cliente (aplicação).
        // Isso acontece por conta que a aplicação conhece o melhor builder
        // a ser usado para criar um produto específico
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        

        // O produto final geralmente é obtido a partir de um objeto construtor, 
        //uma vez que o Diretor não está ciente e não depende de 
        //construtores concretos e produtos.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // O diretor deve saber todas as formas de criação
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}