**2.2.3 Questions**
1. In the StudentMain class, indicate the line of program code used for the instance process!
What is the name of the resulting object?
2. How do I access the attributes and methods of an object?
3. Why are the output output results of the method tampilkanInformasi() first and second
different?

**answer**
1. The resulting object name is mhs1
2. Using the dot operator (.) — e.g., mhs1.nama = "Ali" to access an attribute, and mhs1.tampilkanInformasi() to call a method.
3. Because between the first and second calls, the methods ubahKelas("SI 2K") and updateIpk(3.60) were called, which changed the kelas and ipk attributes. The second call reflects the updated values.

**2.3.3 Questions**

1. In the Mahasiswa class in practicum 3, indicate the program code line used to declare a
parameterized constructor!
2. Pay attention to the StudentMain class. What exactly does the following line of program do?
3. Remove the default constructor on the Mahasiswa class, and then compile and run the
program. How did it turn out? Explain why this is the case!
4. After instantiating the object, do the methods in the Mahasiswa class have to be accessed
sequentially? Explain why!
5. Create a new object with the name mhs<StudentName> using the parameterized constructor
from the Mahasiswa class!
6. Commit and push program code to Github

**answer**
1. javapublic Mahasiswa(String nm, String nim, double ipk, String kls)
2. javaMahasiswa mhs2 = new Mahasiswa("Annisa Nabila","2141720160", 3.25,"TI 2L");
It instantiates a new object named mhs2 of class Mahasiswa using the parameterized constructor, initializing nama = "Annisa Nabila", nim = "2141720160", ipk = 3.25, and kelas = "TI 2L" all at once.
3. The program will produce a compile error on the line Mahasiswa mhs1 = new Mahasiswa(); because Java will no longer provide a no-argument constructor — once you define a parameterized constructor, Java does not auto-generate the default one. So mhs1 which uses new Mahasiswa() will fail to compile.
4. No. Methods can be called in any order after an object is instantiated. However, the results may depend on order — e.g., calling tampilkanInformasi() before updateIpk() will show the old IPK value. The order matters logically based on what state you want the object to be in, but Java does not enforce any required sequence.
5. New object using parameterized constructor: (see code below — mhsStudent)