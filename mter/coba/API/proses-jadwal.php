<?php

include ('config.php');

	$shubuh = $_POST['shubuh'];


	$sql = "UPDATE jadwal_sholat SET shubuh='$shubuh'";
	$query = mysqli_query($db, $sql);


	if( $query ) {

	}else {
		die("GAGAL MENYIMPAN PERUBAHAN.......");
	}


