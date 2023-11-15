package fabiomarras.u5w3d3.es1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
public class Es1Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info user = new Info("Fabio", "Marras", LocalDate.of(1996, 11, 13));

        Adapter adapter = new Adapter(user);

        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println(userData.getNomeCompleto());
        System.out.println(userData.getEta());
    }
}
