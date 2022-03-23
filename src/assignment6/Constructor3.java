package assignment6;

public class Constructor3
{
    public String name;

    public Constructor3(String name)
    {
        this.name=name;
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args)
    {
        Constructor3[] list = {new Constructor3("steve"),new Constructor3("austin")};

    }
}
