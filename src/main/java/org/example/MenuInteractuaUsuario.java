package org.example;
import java.util.List;
import java.util.Scanner;

public class MenuInteractuaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion= 0 ;
        CrearObjets crearObjets = new CrearObjets();
        crearObjets.Carga("casetas.txt");
        List<CasetaFeria> casetas = crearObjets.getCasetas();
        UnmarshallingCasetasJSON unmarshallingCasetasJSON = new UnmarshallingCasetasJSON();

        // Escribir contenido en JSON
        MarshallingCasetasJSON marshallingCasetasJSON = new MarshallingCasetasJSON();
        marshallingCasetasJSON.marshallingCasetasJSON(casetas);

        // Escribir contenido en XML
        MarshallingCasetasXML marshallingCasetasXML = new MarshallingCasetasXML();
        marshallingCasetasXML.marshallingCasetasXML(casetas);

        do {
                System.out.println("Por favor selecione una opcion");
                System.out.println("1. Marshalling casetas a XML");
                System.out.println("2. Unmarshalling casetas de XML");
                System.out.println("3. Mostrar la caseta número X");
                System.out.println("4. Marshalling casetas a JSON");
                System.out.println("5. Unmarshalling casetas de JSON");
                System.out.println("6. Mostrar la caseta número X desde JSON");
                System.out.println("7. Salir");
                opcion = sc.nextInt();

            if (opcion> 0 && opcion < 8) {

                switch (opcion) {
                    case 1:
                        System.out.println("Has selecionado la opcion de Marshalling casetas a XML");
                        marshallingCasetasXML.marshallingCasetasXML(casetas);
                        break;
                    case 2:
                        System.out.println("Has selecionado la opcion de Unmarshalling casetas de XML");
                        UnmarshallingCasetasXML unmarshallingCasetasXML = new UnmarshallingCasetasXML();
                        List<CasetaFeria> casetasXML = unmarshallingCasetasXML.unmarshallingCasetasXML();
                        System.out.println("Casetas leídas desde XML:");
                        for (CasetaFeria caseta : casetasXML) {
                            System.out.println(caseta.toString());
                        }
                        break;
                    case 3:
                        System.out.println("Has selecionado la opcion de Mostrar la caseta número X");
                        MostrarCaseta mostrarCaseta = new MostrarCaseta();
                        System.out.println("Introduzca el ID de la caseta:");
                        int id = sc.nextInt();
                        mostrarCaseta.mostrarCaseta(casetas, id);
                        break;
                    case 4:
                        System.out.println("Has selecionado la opcion de Marshalling casetas a JSON");
                        marshallingCasetasJSON.marshallingCasetasJSON(casetas);
                        break;
                    case 5:
                        System.out.println("Has selecionado la opcion de Unmarshalling casetas de JSON");

                        List<CasetaFeria> casetasJSON = unmarshallingCasetasJSON.unmarshallingCasetasJSON();
                        System.out.println("Casetas leídas desde JSON:");
                        for (CasetaFeria caseta : casetasJSON) {
                            System.out.println(caseta.toString());
                        }
                        break;
                    case 6:
                        System.out.println("Has selecionado la opcion de Mostrar la caseta número X desde JSON");
                        MostrarCasetaJSON mostrarCasetaJSON = new MostrarCasetaJSON();
                        System.out.println("Introduzca el ID de la caseta:");
                        id = sc.nextInt();
                        List<CasetaFeria> casetasJSON2 = unmarshallingCasetasJSON.unmarshallingCasetasJSON();
                        mostrarCasetaJSON.mostrarCaseta(casetasJSON2, id);
                        break;
                    case 7:
                        System.out.println("Programa cerrado");
                        break;
                }
            }else{
                System.out.println("*Numero no valido introduca otro*");
                System.out.println("");
            }

        } while (opcion != 7);
        System.exit(1);
    }
}
