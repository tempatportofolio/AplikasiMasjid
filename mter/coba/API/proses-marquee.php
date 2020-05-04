<?php

include ('config.php');

	$isi_marquee = $_POST['isi_marquee'];

	$sql = "UPDATE marquee SET isi_marquee='$isi_marquee'";
	$query = mysqli_query($db, $sql);


	if( $query ) {

	}else {
		die("GAGAL MENYIMPAN PERUBAHAN.......");
	}


