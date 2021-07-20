package domain;

public class Material {
    private String title;
    private int year;

    public Material(String title, int year) throws IllegalArgumentException {
        setTitle(title);
        setYear(year);
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        if(title == null || title.isBlank()) {
            throw new IllegalArgumentException("Invalid argument 'title'");
        }
        this.title = title;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        if(year <= 0) {
            throw new IllegalArgumentException("Invalid argument 'year'");
        }
        this.year = year;
    }

    public String toString() {
        return "Material [title=" + title + ", year=" + year + "]";
    }
    
    public static void main(String[] args) {
        try {
            Material m = new Material("", 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }
        
        try {
            Material m = new Material("    ", 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            Material m = new Material(null, 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            Material m = new Material("teste", 0);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }
        
        Material m = new Material("teste", 2012);
        System.out.println("SUCCESS: " + m);
    }
}
