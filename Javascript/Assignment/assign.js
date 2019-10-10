document.getElementById('listid').innerHTML=
`
<ol>
        <li>Java</li>
        <li>Python</li>
        <li>Ruby</li>
        <li>C</li>
        <li>C++</li>
        </ol>
        <ol type="A">
            <li>Porche</li>
            <li>BMW</li>
            <li>Mercedes</li>
            <li>Jaguar</li>
            <li>Audi</li>
            </ol>
            <ol type="a">
                <li>Ktm</li>
                <li>Ducati</li>
                <li>Hornet</li>
                <li>Pulsar</li>
                <li>Honda City</li>
                </ol>
                <ol type="I">
                    <li>Robert Downey Jr</li>
                    <li>Chris Evans</li>
                    <li>Chris Hemsworth</li>
                    <li>Mark Ruffalo</li>
                    <li>Jermey Rener</li>
                </ol>
                    <ol type="i">
                        <li>Apple</li>
                        <li>Mango</li>
                        <li>Jackfruit</li>
                        <li>Orange</li>
                        <li>Pineapple</li>
    </ol>

    <ul>
        <li>Red</li>
        <li>Blue</li>
        <li>White</li>
        <li>Black</li>
        <li>Orange</li>
        </ul>
        <ul type="square">
        <li>SNMR</li>
        <li>STQA</li>
        <li>CSM</li>
        <li>BDA</li>
        </ul>
        <ul type="disc">
            <li>WT</li>
            <li>ECEB</li>
            <li>SPM</li>
            <li>IS</li>
            <li>CC</li>
        </ul>
            <ul type="circle">
                <li>GOT</li>
                <li>Lucifer</li>
                <li>Flash</li>
                <li>Arrow</li>
                <li>HTGAWM</li>
                </ul>
                <ul type="circle">
                <li>Usual Suspect</li>
                <li>Home Alone</li>
                <li>Avatar</li>
                <li>Wolf of the Wall Street</li>
                <li>Liar Liar</li>
                </ul>
`;
document.getElementById('formid').innerHTML=
`
<form action="">
<fieldset>
    <label for="name">Name</label><br>
 <input type="text" name="name" id="name"><br>

 <label for="age">Age</label><br>
 <input type="number" name="age" id="age" min="1" max="100"><br>

    <label for="address">Address</label><br>
    <input type="address" name="address" id="address" size="50"><br>
   
    <label for="DOB">DOB</label><br>
    <input type="date" name="date" id="date"><br>
   
    <label for="email">Email</label><br>
    <input type="email" name="email" id="email"><br>

    <label for="Gender">Gender</label><br>
    <input type="radio" name="Gender" id="male">Male
    <input type="radio" name="Gender" id="female">Female
    <input type="radio" name="Gender" id="other">Other<br>

    <input type="submit">
</fieldset>
</form>
`
;
document.getElementById('tablesid').innerHTML=`
<table border="1px">
    <tr>
        <td>Name</td>
        <td>Age</td>
        <td>DOB</td>
        <td>Address</td>
        <td>Email</td>
        <td>Gender</td>
    </tr>
    <tr>
        <td>Vignesh</td>
        <td>22</td>
        <td>22/01/1997</td>
        <td>Mumbai</td>
        <td>viggyvaithiar18@gmail.com</td>
        <td>Male</td>
    </tr>
    <tr>
        <td>Indhu</td>
        <td>19</td>
        <td>19/07/2000</td>
        <td>Chennai</td>
        <td>indhupofficial@gmail.com</td>
        <td>Female</td>
    </tr>
    <tr>
        <td>Vishal</td>
        <td>22</td>
        <td>05/12/1997</td>
        <td>Hydrabad</td>
        <td>vishalpippirishetti@gmai.com</td>
        <td>Male</td>
    </tr>
    <tr>
        <td>Aniket</td>
        <td>22</td>
        <td>27/07/1997</td>
        <td>Mumbai</td>
        <td>aniketv1127@gmai.com</td>
        <td>Male</td>
    </tr>
    <tr>
        <td>Varun</td>
        <td>22</td>
        <td>25/11/1997</td>
        <td>Kharegeon</td>
        <td>sonawanevaruns@gmai.com</td>
        <td>Male</td>
    </tr>
    
    <tr>
        <td>Saurabh</td>
        <td>22</td>
        <td>02/02/1997</td>
        <td>Delhi</td>
        <td>saurabhjha123.sj95@gmai.com</td>
        <td>Male</td>
        </tr>
</table>
`;