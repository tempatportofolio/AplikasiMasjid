<?php

include ('config.php');

	$isha = $_POST['isha'];


	$sql = "UPDATE jadwal_sholat SET isha='$isha'";
	$query = mysqli_query($db, $sql);


	if( $query ) {

	}else {
		die("GAGAL MENYIMPAN PERUBAHAN.......");
	}


