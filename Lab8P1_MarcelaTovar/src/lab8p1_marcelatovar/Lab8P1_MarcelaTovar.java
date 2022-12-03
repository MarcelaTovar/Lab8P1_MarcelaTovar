
package lab8p1_marcelatovar;

import java.util.*;
public class Lab8P1_MarcelaTovar {

    
    public static void main(String[] args) {
        Menu();
    }
    
    public static void Menu(){
        Scanner ObiWan = new Scanner(System.in);
        System.out.println("¡Bienvenido a mi lab de programacion 8!");
        System.out.println("Hola Memo");
        int opcion;
        do{
            System.out.println("---Menu---");
            System.out.println("1. Pocket Monsters\n2. DC vrs Marvel\n3. Salir");
            opcion = ObiWan.nextInt();
            while(opcion != 1 || opcion != 2 || opcion !=3){
                break;
            }
            switch(opcion){
                case 1 ->{
                   PocketMonster(); 
                }
                case 2 ->{
                   DcVsMarvel(); 
                }
            }
        }while(opcion == 1 || opcion == 2 || opcion !=3);
        System.out.println("¡Bye!");
    }
    
    public static void PocketMonster(){
        Scanner ObiWan = new Scanner(System.in);
         ArrayList<Pokemon> Jugador1 = new ArrayList <Pokemon>();
        ArrayList<Pokemon> Jugador2 = new ArrayList <Pokemon>();
        System.out.println("---Bienvenido a Pocket Monster---");
        System.out.println("Jugador 1, Ingrese sus pokemones");
        int contador = 0;
        int contador3 = 0;
        String opcion = "";
        boolean check = true;
        boolean check2 = true;
        while(check){
            
            System.out.println("Ingrese el nombre de su Pokemon: ");
            ObiWan = new Scanner(System.in);
            String nombre = ObiWan.nextLine();
            System.out.println("Ingrese la vida de su Pokemon: ");
            int vida = ObiWan.nextInt();
            if(vida > 300){
                System.out.println("Ingrese valor de vida válido");
            }else{
                System.out.println("Ingrese puntos de ataque: ");
                int ataque = ObiWan.nextInt();
                int suerte = new Random().nextInt((5-1)+1)+1;
                Pokemon jugador1 = new Pokemon(nombre,vida,ataque,suerte);
                Jugador1.add(jugador1);
                System.out.println("¿Desea ingresar otro pokemon? ( S para Si, N para no)");
                opcion = ObiWan.next();
                contador = contador + 1;
                if (opcion.equalsIgnoreCase("S")) {
                  
                    if (contador == 3) {
                        System.out.println("No se puede ingresar mas pokemones");
                        check = false;
                    }
                }else if(opcion.equalsIgnoreCase("N")){
                    check = false;
                }
            }
        }
        
        System.out.println("Jugador 2, Ingrese sus pokemones");
          while(check2){
            ObiWan = new Scanner(System.in);
            System.out.println("Ingrese el nombre de su Pokemon: ");
            ObiWan = new Scanner(System.in);
            String nombre = ObiWan.nextLine();
            System.out.println("Ingrese la vida de su Pokemon: ");
            int vida = ObiWan.nextInt();
            if(vida > 300){
                System.out.println("Ingrese valor de vida válido");
            }else{
                System.out.println("Ingrese puntos de ataque: ");
                int ataque = ObiWan.nextInt();
                int suerte2 = new Random().nextInt((5-1)+1)+1;
                Pokemon jugador2 = new Pokemon(nombre,vida,ataque,suerte2);
                Jugador2.add(jugador2);
                System.out.println("¿Desea ingresar otro pokemon? ( S para Si, N para no)");
                opcion = ObiWan.next();
                contador3 = contador3 + 1;
                if (opcion.equalsIgnoreCase("S")) {
                  
                    if (contador3 == 3) {
                        System.out.println("No se puede ingresar mas pokemones");
                        check2 = false;
                    }
                }else if(opcion.equalsIgnoreCase("N")){
                    check2 = false;
                }else{
                    System.out.println("Ingrese una letra valida");
                    break;
                }
            }        
        }
          Pokemon pelea1 = Jugador1.get(0);
          Pokemon pelea2 = Jugador2.get(0);
          
         boolean check3 = true;
          int contador2 = 0;
          do{
              pelea1.setSuerte(new Random().nextInt((5-1)+1)+1);
              pelea2.setSuerte(new Random().nextInt((5-1)+1)+1);
              if(Jugador1.size()==3||Jugador2.size()==3){
             if (pelea1.getVida()<=0) {
                  System.out.println("RESULTADO: "+pelea2.getNombre()+"Gana");
                  check = false;
                  
                  if (Jugador1.size()>=2) {
                     pelea1 = Jugador1.get(1);
                      if (pelea1.getVida()<=0) {

                          check=false;
                          
                          if(Jugador1.size()==3){
                            pelea1 = Jugador1.get(2);  
                            if (pelea1.getVida()<=0) {

                          check = false;
                                System.out.println("¡Gana Jugador2!");
                          if (pelea1.getVida()==0) {
                              break;
                          }
                          }
                      }
                 }
                  } 
              }else if(pelea2.getVida()<=0){
                  System.out.println("RESULTADO: "+pelea1.getNombre()+"Gana");
                  check = false;                
                   if (Jugador2.size()>=2) {
                     pelea2 = Jugador2.get(1);
                     if (pelea2.getVida()==0) {

                          check = false;
                          
                          if(Jugador2.size()==3){
                            pelea2 = Jugador2.get(2);  
                            if (pelea2.getVida()<=0) {

                                System.out.println("¡Gana Jugador1!");
                          check = false;
                          if (pelea2.getVida()==0) {
                              break;
                          }
                          }
                      }
                      }
                 }
              }
          
              
              contador2++;
          if(pelea1.getSuerte()>pelea2.getSuerte()){
              
              System.out.println("---Ronda"+contador2+"---");
              System.out.println(pelea1.getNombre()+" ataca primero, tiene: "+pelea1.getVida()+" de vida");
              System.out.println(pelea2.getNombre()+" ataca segundo, tiene: "+pelea2.getVida()+" de vida");
              pelea2.setVida(pelea2.getVida()-pelea1.getAtaque());
              System.out.println("--Puntos restantes--");
              System.out.println(pelea2.getNombre()+"tiene de vida: "+pelea2.getVida());
              System.out.println(pelea1.getNombre()+"tiene de vida: "+pelea1.getVida());
              
          }else if(pelea2.getSuerte()>pelea1.getSuerte()){
              
              System.out.println("---Ronda"+contador2+"---");
              System.out.println(pelea2.getNombre()+" ataca primero, tiene: "+pelea2.getVida()+" de vida");
              System.out.println(pelea1.getNombre()+" ataca segundo, tiene: "+pelea1.getVida()+" de vida");
               pelea1.setVida(pelea1.getVida()-pelea2.getAtaque());
              System.out.println("--Puntos restantes--");
              System.out.println(pelea2.getNombre()+"tiene de vida: "+pelea2.getVida());
              System.out.println(pelea1.getNombre()+"tiene de vida: "+pelea1.getVida());
              
          }
              }else if(Jugador1.size()==1||Jugador2.size()==1){

             if (pelea1.getVida()<=0) {
                  System.out.println("RESULTADO: "+pelea2.getNombre()+"Gana");
                  check = false;
                  System.out.println("¡Gana Jugador2!");
                  if (pelea1.getVida()==0) {
                              break;
                          }
                  
                 }
                   
              else if(pelea2.getVida()<=0){
                  System.out.println("RESULTADO: "+pelea1.getNombre()+"Gana");
                  check = false;  
                  System.out.println("¡Gana Jugador1!");
                   if (pelea2.getVida()==0) {
                              break;
                          }   
              }
  
              contador2++;
          if(pelea1.getSuerte()>pelea2.getSuerte()){
              
              System.out.println("---Ronda"+contador2+"---");
              System.out.println(pelea1.getNombre()+" ataca primero, tiene: "+pelea1.getVida()+" de vida");
              System.out.println(pelea2.getNombre()+" ataca segundo, tiene: "+pelea2.getVida()+" de vida");
              pelea2.setVida(pelea2.getVida()-pelea1.getAtaque());
              System.out.println("--Puntos restantes--");
              System.out.println(pelea2.getNombre()+"tiene de vida: "+pelea2.getVida());
              System.out.println(pelea1.getNombre()+"tiene de vida: "+pelea1.getVida());
              
          }else if(pelea2.getSuerte()>pelea1.getSuerte()){
              
              System.out.println("---Ronda"+contador2+"---");
              System.out.println(pelea2.getNombre()+" ataca primero, tiene: "+pelea2.getVida()+" de vida");
              System.out.println(pelea1.getNombre()+" ataca segundo, tiene: "+pelea1.getVida()+" de vida");
               pelea1.setVida(pelea1.getVida()-pelea2.getAtaque());
              System.out.println("--Puntos restantes--");
              System.out.println(pelea2.getNombre()+"tiene de vida: "+pelea2.getVida());
              System.out.println(pelea1.getNombre()+"tiene de vida: "+pelea1.getVida());
              
          }
              
          
          }else if(Jugador1.size()==2||Jugador2.size()==2){
              if (pelea1.getVida()<=0) {
                  System.out.println("RESULTADO: "+pelea2.getNombre()+"Gana");
                  check = false;
                  if (Jugador1.size()>=2) {
                     pelea1 = Jugador1.get(1);
                      if (pelea1.getVida()<=0) {
                          check=false;
                          System.out.println("¡Gana Jugador2!");
                          if (pelea1.getVida()==0) {
                              break;
                          }
                         
                          }
                      }
                 }
                   
              else if(pelea2.getVida()<=0){
                  System.out.println("RESULTADO: "+pelea1.getNombre()+"Gana");
                  check = false;                
                   if (Jugador2.size()>=2) {
                     pelea2 = Jugador2.get(1);
                     if (pelea2.getVida()<=0) {
                          check = false;
                          System.out.println("¡Gana Jugador1!");
                          if (pelea2.getVida()==0) {
                              break;
                          }
                          
                          }
                      }
                      }
                 
              
          
              
              contador2++;
          if(pelea1.getSuerte()>pelea2.getSuerte()){
              
              System.out.println("---Ronda"+contador2+"---");
              System.out.println(pelea1.getNombre()+" ataca primero, tiene: "+pelea1.getVida()+" de vida");
              System.out.println(pelea2.getNombre()+" ataca segundo, tiene: "+pelea2.getVida()+" de vida");
              pelea2.setVida(pelea2.getVida()-pelea1.getAtaque());
              System.out.println("--Puntos restantes--");
              System.out.println(pelea2.getNombre()+"tiene de vida: "+pelea2.getVida());
              System.out.println(pelea1.getNombre()+"tiene de vida: "+pelea1.getVida());
              
          }else if(pelea2.getSuerte()>pelea1.getSuerte()){
              
              System.out.println("---Ronda"+contador2+"---");
              System.out.println(pelea2.getNombre()+" ataca primero, tiene: "+pelea2.getVida()+" de vida");
              System.out.println(pelea1.getNombre()+" ataca segundo, tiene: "+pelea1.getVida()+" de vida");
               pelea1.setVida(pelea1.getVida()-pelea2.getAtaque());
              System.out.println("--Puntos restantes--");
              System.out.println(pelea2.getNombre()+"tiene de vida: "+pelea2.getVida());
              System.out.println(pelea1.getNombre()+"tiene de vida: "+pelea1.getVida());
              
          }
          }
          }while(check3);
          }
          
          
    
    public static void DcVsMarvel(){
        Scanner ObiWan = new Scanner(System.in);
        ArrayList<Superheroe> DC = new ArrayList <Superheroe>();
        ArrayList<Superheroe> Marvel = new ArrayList <Superheroe>();
        //----------------------DC------------------------------------------
        Superheroe Batman =  new Superheroe("Batman", "DC", "Bruce Wayne", "Gótica");
        DC.add(Batman);
        Superheroe Superman = new Superheroe("Superman","DC","Clark Kent","Krypton");
        DC.add(Superman);
        Superheroe MujerMaravilla = new Superheroe("Mujer Maravilla","DC","Diana Prince","Temiskira");
        DC.add(MujerMaravilla);
        Superheroe Flash = new Superheroe("Flash","DC","Barry Allen","Central City");
        DC.add(Flash);
        Superheroe Robin = new Superheroe("Robin","DC","Damian Wayne","Gótica");
        DC.add(Robin);
        Superheroe Nightwing = new Superheroe("Nightwing","DC","Richard Grayson","Gótica");
        DC.add(Nightwing);
        Superheroe Starfire = new Superheroe("Starfire","DC","Princess Koriand´r","Tamara");
        DC.add(Starfire);
        Superheroe Cyborg = new Superheroe("Cyborg","DC","Victor Stone","Gótica");
        DC.add(Cyborg);
        Superheroe Aquaman = new Superheroe("Aquaman","DC","Arthur Curry","Atlantanna");
        DC.add(Aquaman);
        Superheroe LinternaVerde = new Superheroe("LinternaVerde","DC","Hal Jordan","Metrópolis");
        DC.add(LinternaVerde);
        //-----------------------Marvel---------------------------------------
        Superheroe CapitanAmerica = new Superheroe("CapitanAmerica","Marvel","Steve Rogers","Brooklyn");
        Marvel.add(CapitanAmerica);
        Superheroe IronMan = new Superheroe("Ironman","Marvel","Tony Stark","Nueva York");
        Marvel.add(IronMan);
        Superheroe ViudaNegra = new Superheroe("Viuda Negra","Marvel","Natasha Romanoff","Rusia");
        Marvel.add(ViudaNegra);
        Superheroe Thor = new Superheroe("Thor","Marvel","Thor","Asgard");
        Marvel.add(Thor);
        Superheroe Hulk = new Superheroe("Hulk","Marvel","Bruce Banner","Dayton");
        Marvel.add(Hulk);
        Superheroe Hawkeye = new Superheroe("Hawkeye","Marvel","Clint Barton","Iowa");
        Marvel.add(Hawkeye);
        Superheroe ProfessorX = new Superheroe("Profesor X","Marvel","Charles Xavier","Nueva York");
        Marvel.add(ProfessorX);
        Superheroe Wolverine = new Superheroe("Wolverine","Marvel","James Howlett","Alberta");
        Marvel.add(Wolverine);
        Superheroe MrFantastico = new Superheroe("MrFantastic","Marvel","Reed Richards","Nueva York");
        Marvel.add(MrFantastico);
        Superheroe Strange = new Superheroe("DrStrange","Marvel","Stephen Strange","Nueva York");
        Marvel.add(Strange);
        //------------------------------------------------------------------------
        System.out.println("---Bienvenido a Dc Vs Marvel---");
        System.out.println("Tiene dos opcion\n1. Buscar el Superheroe\n2. Agregar un Superheroe: ");
        int opcion = ObiWan.nextInt();
        if (opcion == 1) {
            System.out.println("¿Que superheroe desea buscar?");
            ObiWan.nextLine();
            String buscar = ObiWan.nextLine();
            for (int i = 0; i < DC.size(); i++) {
                Superheroe super1 = DC.get(i);
                if (super1.getNombre().equalsIgnoreCase(buscar)) {
                    System.out.println("Se encontro en la lista DC");
                    System.out.println(super1);
                    break;
                }
            }
            
            for (int i = 0; i < Marvel.size(); i++) {
                Superheroe super2 = Marvel.get(i);
                if (super2.getNombre().equalsIgnoreCase(buscar)) {
                    System.out.println("Se encontro en la lista Marvel");
                    System.out.println(super2);
                    break;
                }  
            }
       
        }else if(opcion == 2){
            int n = 0;
            while(n!=1){
                System.out.println("Ingrese francicia");
                String francicia = ObiWan.next();
                if (francicia.equalsIgnoreCase("DC")) {
                    System.out.println("Ingrese nombre: ");
                    ObiWan = new Scanner(System.in);
                    String nombre = ObiWan.nextLine();
                    
                    System.out.println("Ingrese identidad: ");
                    ObiWan = new Scanner(System.in);
                    String identidad = ObiWan.nextLine();
                    System.out.println("Ingrese origen: ");
                    ObiWan = new Scanner(System.in);
                    String origen = ObiWan.nextLine();
                    Superheroe nuevo = new Superheroe(nombre,francicia,identidad,origen);
                    for (int i = 0; i < DC.size(); i++) {
                        Superheroe super1 = DC.get(i);
                     if (super1.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Se encontro en la lista DC, no se puede agregar");
                    break;
                    }else{
                    System.out.println("Se ha añadido correctamente a la lista DC");
                    break;
                    }
                    }
                  break;
                }else if(francicia.equalsIgnoreCase("Marvel")){
                    System.out.println("Ingrese nombre: ");
                    ObiWan = new Scanner(System.in);
                    String nombre = ObiWan.nextLine();
                    System.out.println("Ingrese identidad: ");
                    ObiWan = new Scanner(System.in);
                    String identidad = ObiWan.nextLine();
                    System.out.println("Ingrese origen: ");
                    ObiWan = new Scanner(System.in);
                    String origen = ObiWan.nextLine();
                    Superheroe nuevo = new Superheroe(nombre,francicia,identidad,origen);
                    for (int i = 0; i < Marvel.size(); i++) {
                        Superheroe super2 = Marvel.get(i);
                     if (super2.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Se encontro en la lista Marvel, no se puede agregar");
                    break;
                    }else{
                    System.out.println("Se ha añadido correctamente a la lista Marvel");
                    break;
                    }
                    }
                  break;
                }else{
                    System.out.println("Ingrese una francicia valida");
                    break;
                }
            }
        }else{
            System.out.println("Favor ingrese un numero valido");
        }
    }
   
    
   
    
    
}
