package Reto2_Web;
import Reto2_Web.interfaces.InterfaceLaptops;
import Reto2_Web.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner {
    @Autowired
	private InterfaceLaptops interfaceLaptops;
    @Autowired
        private InterfaceUser interfaceUser;
            public static void main(String[] args){
		SpringApplication.run(Reto2WebApplication.class, args);
	}
            @Override
        public void run(String... args) throws Exception{
            interfaceLaptops.deleteAll();
            interfaceUser.deleteAll();
        }
}
