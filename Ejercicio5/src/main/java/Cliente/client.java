package Cliente;

import Controles.Dao;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Scanner;

public class client {

private static Scanner sc = new Scanner(System.in) ;
    public static void main(String[] args) throws MalformedURLException, XmlRpcException{
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1300"));
        XmlRpcClient client =new XmlRpcClient();
        client.setConfig(config);

        Dao dao = new Dao();
        int id = 0;
        String fecha =  String.valueOf(LocalDateTime.now());


        String opcion = "", num1 = "", num2 = "";
        do {
            System.out.println("1.-Suma \n2.-Resta \n3.-Multiplicacion \n4.-Division \n5.-Expente \n6.-Raiz \n7.-Salir ");
            opcion = sc.next();
            if (isNumber(opcion)){
                if(Integer.parseInt(opcion) == 1 || Integer.parseInt(opcion) == 2 || Integer.parseInt(opcion) == 3 || Integer.parseInt(opcion) == 4){
                    do {
                        System.out.println("Ingresar el primer valor");
                        num1 = sc.next();
                        if (!isNumber(num1)){
                            System.out.println("Error.. Ingresar valor numerico");
                        }
                    }while (!isNumber(num1));
                    do {
                        System.out.println("Ingresar el segundo valor");
                        num2 = sc.next();
                        if (!isNumber(num2)){
                            System.out.println("Error.. Ingresar valor numerico");
                        }
                    }while (!isNumber(num2));
                }

                double numero1 = Double.parseDouble(num1);
                double numero2 = Double.parseDouble(num2);

                switch (Integer.parseInt(opcion)){
                    case 1:
                        Object[] infor = new Object[]{numero1, numero2};
                        double response = (double)client.execute("methods.sumar", infor);
                        System.out.println("Resultado Suma: "+response);
                        dao.insertarDato(id, "Suma", numero1, numero2, response, fecha);
                        break;
                    case 2:
                        Object[] infor2 = new Object[]{numero1, numero2};
                        double response2 = (double)client.execute("methods.resta", infor2);
                        System.out.println("Resultado Resta: "+response2);
                        dao.insertarDato(id, "Resta", numero1, numero2, response2, fecha);
                        break;
                    case 3:
                        Object[] infor3 = new Object[]{numero1, numero2};
                        double response3 = (double)client.execute("methods.multiplicacion", infor3);
                        System.out.println("Resultado Multiplicacion: "+response3);
                        dao.insertarDato(id, "Multiplicacion", numero1, numero2, response3, fecha);
                        break;
                    case 4:
                        Object[] infor4 = new Object[]{numero1, numero2};
                        double response4 = (double)client.execute("methods.division", infor4);
                        System.out.println("Resultado Division: "+response4);
                        dao.insertarDato(id, "Division", numero1, numero2, response4, fecha);
                        break;
                    case 5:
                        do {
                            System.out.println("Ingresar el numero");
                            num1 = sc.next();
                            if (!isNumber(num1)){
                                System.out.println("Error.. Ingresar valor numerico");
                            }
                        }while (!isNumber(num1));
                        do {
                            System.out.println("Ingresar el exponente");
                            num2 = sc.next();
                            if (!isNumber(num2)){
                                System.out.println("Error.. Ingresar valor numerico");
                            }
                        }while (!isNumber(num2));
                        double numer1 = Double.parseDouble(num1);
                        double numer2 = Double.parseDouble(num2);
                        Object[] infor5 = new Object[]{numer1, numer2};
                        double response5 = (double)client.execute("methods.exponente", infor5);
                        System.out.println("Resultado Exponente: "+response5);
                        dao.insertarDato(id, "Exponente", numer1, numer2, response5, fecha);
                        break;
                    case 6:
                        do {
                            System.out.println("Ingresar el numero que se sacara raiz");
                            num1 = sc.next();
                            if (!isNumber(num1)){
                                System.out.println("Error.. Ingresar valor numerico");
                            }
                        }while (!isNumber(num1));
                        double nume1 = Double.parseDouble(num1);
                        double nume2 = 0;
                        Object[] infor6 = new Object[]{nume1};
                        double response6 = (double)client.execute("methods.raiz", infor6);
                        System.out.println("Resultado Raiz: "+response6);
                        dao.insertarDato(id, "Raiz", nume1, nume2, response6, fecha);
                        break;
                    case 7:
                        System.out.println("Sayonara");
                        break;
                    default:
                        System.out.println("Ingresar una opcion valida");
                }
            }else{
                System.out.println("Ingresar un valor valido");
            }

        }while (!opcion.equals("7"));
    }

    public static boolean isNumber(String number){
        try {
            double num = Double.parseDouble(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }

    }

}

// Crear tabla