//import java.util.Comparator;
//
//public class PersonComparator implements Comparator<Person> {
//    private int wordСount;
//
//    public PersonComparator(int wordСount) {
//        this.wordСount = wordСount;
//    }
//
//    public int getWordСount() {
//        return wordСount;
//    }
//
//    @Override
//    public int compare(Person o1, Person o2) {
//        int wordСountO1 = o1.getSurname().split(" ").length;
//        int wordСountO2 = o2.getSurname().split(" ").length;
//        int value = 0;
//        if (!(wordСountO1 >= wordСount & wordСountO2 >= wordСount)) {
//            value = wordСountO2 - wordСountO1;
//        } else {
//            return o2.getAge() - o1.getAge();
//        }
//        return value;
//    }
//}
