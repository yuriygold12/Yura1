package lesson_29;

public abstract class DevelopProject {

    public abstract Develop hireDeveloper();

    public void startWork()
    {
        Develop developer = hireDeveloper();
        developer.analisyTask();
        developer.codeTask();
        developer.refectTask();
        developer.testTask();
    }
}
