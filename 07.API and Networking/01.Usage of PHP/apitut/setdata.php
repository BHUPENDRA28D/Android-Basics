<?php
echo "Welcome to connecting to mysq<br>";

/*
Ways to connect to a MysQL Database
1. MysQLi extension
2. PDO
*/
 // Connecting to the Database

$servername = "localhost";
$username ="root";
$password = "";
// Create a connection
$conn = mysqli_connect ($servername, $username, $password);
mysqli_select_db ( $conn ,"apidb" );


// Here name and email variables are declared and data is inserted through post function. 
$name  =$_POST[ 'name '];
$email  =$_POST ['email'];


// qry variable is made to give value and and wri tten function to insert data in tables.
$qry="INSERT INTO 'tbl_user' (id', 'name', 'email ')
        VALUES (NULL, $name',$email')";



$res=mysqli_query ($conn, $qry);
if ($res==true)
    $response="inserted" ;

else
    $response="failed";

// Here echo means returning the respones;
echo json_encode ($response) ;

// Die if connection was not successful
if(!$conn){
    die ("Connection Failed: ". mysqli_connect_errno());
}
else{
echo "Connection to mysql was successful";}
?>