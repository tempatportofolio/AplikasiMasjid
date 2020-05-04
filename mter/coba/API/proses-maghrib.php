<?php

include ('config.php');

	$maghrib = $_POST['maghrib'];


	$sql = "UPDATE jadwal_sholat SET maghrib='$maghrib'";
	$query = mysqli_query($db, $sql);


	if( $query ) {

	}else {
		die("GAGAL MENYIMPAN PERUBAHAN.......");
	}


