public class actualizacionVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono = 200
        salary = salary + 200;
        System.out.println(salary);

        //pension = 50
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extras = 30 c/u
        //comida = 45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //actualizando cadenas de texto
        String employeeName = "Eliezer Martinez";
        employeeName = employeeName + "Landaeta";
        System.out.println(employeeName);

        employeeName = "Federico " + employeeName;
        System.out.println(employeeName);
    }
}
