<?php

include("config.php");



$sql = "SELECT * FROM pengumuman_masjid";
$result = array();
$query = mysqli_query($db, $sql);
 
while($row = mysqli_fetch_array($query)){
    array_push($result, array('judul' => $row['judul_pengumuman'],
    	'isi' => $row['isi_pengumuman']
));
}
echo json_encode(array("result" => $result));
?>



