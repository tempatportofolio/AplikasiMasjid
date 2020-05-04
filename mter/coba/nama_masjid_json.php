<?php

include("config.php");



$sql = "SELECT * FROM identitas_masjid";
$result = array();
$query = mysqli_query($db, $sql);
 
while($row = mysqli_fetch_array($query)){
    array_push($result, array('Nama' => $row['nama_masjid'],
    'Alamat' => $row['alamat_masjid']
));
}
echo json_encode(array("result" => $result));
?>



