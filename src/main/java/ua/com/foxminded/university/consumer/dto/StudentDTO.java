package ua.com.foxminded.university.consumer.dto;

import ua.com.foxminded.university.persistance.model.StudentEntity;

import java.util.Objects;

public class StudentDTO {
    private Long id;

    private String firstName;

    private String lastName;

    private Byte age;

    private Long groupId;

    private String groupName;

    private Byte course;

    private String email;

    public StudentDTO() {

    }

    public StudentDTO(StudentDTOBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.course = builder.course;
        this.email = builder.email;
    }

    public StudentDTO(StudentEntity entity) {
        this.id = entity.getId();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.age = entity.getAge();
        this.groupId = entity.getGroupId();
        this.course = entity.getCourse();
        this.email = entity.getEmail();
    }

    public static class StudentDTOBuilder {

        private Long id;

        private String firstName;

        private String lastName;

        private Byte age;

        private Long groupId;

        private String groupName;

        private Byte course;

        private String email;


        public StudentDTOBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentDTOBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentDTOBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public StudentDTOBuilder setAge(Byte age) {
            this.age = age;
            return this;
        }

        public StudentDTOBuilder setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        public StudentDTOBuilder setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        public StudentDTOBuilder setCourse(Byte course) {
            this.course = course;
            return this;
        }

        public StudentDTOBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentDTO build() {
            return new StudentDTO(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Long getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Byte getCourse() {
        return course;
    }

    public void setCourse(Byte course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", course=" + course +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDTO that = (StudentDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(age, that.age) && Objects.equals(groupId, that.groupId) && Objects.equals(groupName, that.groupName) && Objects.equals(course, that.course) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, groupId, groupName, course, email);
    }
}

