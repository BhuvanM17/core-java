import com.xworkz.project.dao.ProjectSevenDao;
import com.xworkz.project.dta.ProjectSevenDto;

public class ProjectSevenRunner {
    public static void main(String[] args) {
        ProjectSevenDto dto= new ProjectSevenDto();
        dto.cpvLocation = "banglore";
        dto.cwd="bhuvan";
        dto.givenName="bhuvan";
        dto.surName="m";
        dto.pwd="bhuvan";
        dto.dcdrLocation=8;
        dto.captcha="2thfu5";
        dto.dob="27/4/7877";
        dto.email="bhugand@gmail.com";
        dto.hintAns="cric";
        dto.hintQue="fav";
        dto.isemailoginSame=true;
        dto.loginId="1Bh";

        ProjectSevenDao dao = new ProjectSevenDao();
        dao.createPassport(dto);
        dao.getDetails();



    }
}
