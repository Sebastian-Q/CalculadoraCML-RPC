package Controles;

public class datesCalculadora {

    private int id;

    private String operacion;

    private double num1;

    private double num2;

    private double total;

    private String fecha;

    public datesCalculadora(){
    }

    public datesCalculadora(int id, String operacion, double num1, double num2, double total, String fecha){
        this.id = id;
        this.operacion = operacion;
        this.num1 = num1;
        this.num2 = num2;
        this.total = total;
        this.fecha = fecha;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getOperacion() { return operacion; }

    public void setOperacion(String operacion) { this.operacion = operacion; }

    public double getNum1() { return num1; }

    public void setNum1(double num1) { this.num1 = num1; }

    public double getNum2() { return num2; }

    public void setNum2(double num2) { this.num2 = num2; }

    public double getTotal() { return total; }

    public void setTotal(double total) { this.total = total; }

    public String getFecha() { return fecha; }

    public void setFecha(String fecha) { this.fecha = fecha; }
}
