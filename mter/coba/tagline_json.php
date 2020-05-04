<?php

include("config.php");



$sql = "SELECT * FROM tagline";
$result = array();
$query = mysqli_query($db, $sql);
 
while($row = mysqli_fetch_array($query)){
    array_push($result, array('Isi' => $row['isi_tagline']
));
}
echo json_encode(array("result" => $result));
?>



