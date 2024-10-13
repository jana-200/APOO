import java.time.Duration;
import java.time.LocalDateTime;

public class TestAppelTelephonique {
    public static void main(String[] args) {
        Duration duree1 = Duration.ofSeconds(123);
        LocalDateTime time1 = LocalDateTime.now();
        AppelTelephonique appel1 = new AppelTelephonique(time1,"0489086058",duree1,0.17);
        System.out.println(appel1);

        Duration duree2 = Duration.ofSeconds(1);
        AppelTelephonique appel2 = new AppelTelephonique(time1,"0487372588",duree2);
        System.out.println(appel2);

        Duration duree3 = Duration.ofSeconds(300);
        AppelTelephonique appel3 = new AppelTelephonique(time1,"1111111111",duree3,0.1);
        System.out.println(appel3);

        Duration duree4 = Duration.ofSeconds(500);
        AppelTelephonique appel4 = new AppelTelephonique(time1,"2222222222",duree4);
        System.out.println(appel4);

    }
}
