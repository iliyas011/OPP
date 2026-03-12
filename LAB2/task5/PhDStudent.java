package LAB2.task5;

class PhDStudent extends Person {
    private String department;
    private String researchField;

    public PhDStudent(String name, int age, String department, String researchField) {
        super(name, age);
        this.department = department;
        this.researchField = researchField;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("Constraint: PhD students cannot take care of dogs!");
            return;
        }
        super.assignPet(pet);
    }

    @Override
    public String getOccupation() { return "PhD Student in " + department; }
}