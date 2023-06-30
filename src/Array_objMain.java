public class Array_objMain {
    public static void main(String[] args) {

        Array_obj [] refrigerator = new Array_obj[4];

        Array_obj fruit1 = new Array_obj("Orange");
        Array_obj fruit2 = new Array_obj("Banana");
        Array_obj fruit3 = new Array_obj("Dragon fruit");

        refrigerator [0] = fruit1;
        refrigerator [1] = fruit2;
        refrigerator [2] = fruit3;

        System.out.println(refrigerator[0].name); // if we don't .name it will show the address of the array in Memory
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

    }
}
