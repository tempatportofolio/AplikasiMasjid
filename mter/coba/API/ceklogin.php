<?php

include("config.php");

$username= $_POST['username'];
$password= $_POST['password'];


$sql = "SELECT * FROM user WHERE username='$username' AND password='$password'";
$result = array();
$query = mysqli_query($db, $sql);
$stat=mysqli_num_rows ( $query ); 

array_push($result, array('status' => $stat));
echo json_encode(array("result" => $result));
?>
