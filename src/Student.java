import java.util.*;

public class Student{
    private String name;
    private int studentId;

    private static Student student1 = new Student("sugar",1);
    private static Student student2 = new Student("wanghan",25);
    private static Student student3 = new Student("sugar",32);
    private static Student student4 = new Student("azhanghangbo",42);
    private static Student student5 = new Student("sugar",80);

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return (studentId == student.studentId)&&(name==student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId,name);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public static void testHashMap(){


        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
        System.out.println(student5.hashCode());

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put(student1.getName(),student1.getStudentId());
        hashMap.put(student2.getName(),student2.getStudentId());
        hashMap.put(student3.getName(),student3.getStudentId());
        hashMap.put(student4.getName(),student4.getStudentId());
        hashMap.put(student5.getName(),student5.getStudentId());

        hashMap.put(student3.getName(),100);

        System.out.println("For Loop:");
        for(Map.Entry entry: hashMap.entrySet() ){
            System.out.println("Key: "+entry.getKey() + " & Value: " + entry.getValue());
        }
        System.out.println("While Loop:");
        Iterator iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry me2 = (Map.Entry) iterator.next();
            System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        }

    }


    public static void testTreeMap(){
        Map<String, Integer> treeMap = new TreeMap<>(new SortById());
        treeMap.put(student1.getName(),student1.getStudentId());
        treeMap.put(student2.getName(),student2.getStudentId());
        treeMap.put(student3.getName(),student3.getStudentId());
        treeMap.put(student4.getName(),student4.getStudentId());
        treeMap.put(student5.getName(),student5.getStudentId());

        for(Map.Entry entry: treeMap.entrySet()){
            System.out.println("Key: "+entry.getKey() + " & Value: " + entry.getValue());
        }
    }

}
class SortById implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}