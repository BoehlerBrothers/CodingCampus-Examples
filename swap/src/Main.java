public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5}; //start array
        int[] arr2 = {1,3,5,4,2}; //erwartete array
        Permutater permutater = new Permutater();
        System.out.println("Mithilfe des Stacks kann aus dem Ausgangsarray das Zielarray erreicht werden? " + (permutater.solve(arr1, arr2)?"Ja":"Nein"));
    }
}
