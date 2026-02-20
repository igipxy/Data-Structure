**2.1.3 Questions**

1. Name two characteristics of a class or object!

2. Pay attention to the Mahasiswa class in Practicum 1, how many attributes do the Student class
have? Mention what the attributes are!

3. How many methods does the class have? Mention what the methods are!

4. Pay attention to the method updateIpk contained in the Mahasiswa class. Modify the
content of the method so that the GPA entered is valid, namely first checking whether the
GPA entered is in the range of 0.0 to 4.0 (0.0 <= GPA <= 4.0). If the GPA is not in that range,
the message is issued: "GPA is invalid. Must be between 0.0 and 4.0".

5. Explain how the nilaiKinerja() method works in evaluating student performance, what
criteria are used to determine the performance value, and what is returned by the
nilaiKinerja() method?

6. Commit and push program code to Github

**Answer**

1. class : - class is general, - inside class contain object
   object: - object is more specific, - indside object contain attribute

2. The Mahasiswa class has 4 attributes: nim (String), nama (String), kelas (String), and ipk (double).

3. The Mahasiswa class has 4 methods: tampilkanInformasi(), ubahKelas(), updateIpk(), and nilaiKinerja().

4. done make the code

5. The method evaluates student performance based on the ipk value using conditional checks. If ipk >= 3.5 → returns "Kinerja sangat baik", if ipk >= 3.0 → returns "Kinerja baik", if ipk >= 2.0 → returns "Kinerja cukup", otherwise → returns "Kinerja kurang". It returns a String describing the student's performance category.

6. commited