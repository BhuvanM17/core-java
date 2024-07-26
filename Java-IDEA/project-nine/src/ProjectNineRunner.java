import com.xworkz.project.dao.ProjectNineDao;
import com.xworkz.project.dto.ProjectNineDto;

public class ProjectNineRunner {
    public static void main(String[] args) {
        // Example of creating a task
        ProjectNineDto Dto = new ProjectNineDto();
        Dto.taskId="1";
        Dto.taskName="CRUD operations";
        Dto.assigneeName="DEV";
        Dto.taskDescription="Implementation of CRUD operations";
        Dto.isCompleted=true;
        ProjectNineDao dao = new ProjectNineDao();
        dao.createTask(Dto);
        dao.getTaskDetails();

    }
}
