

	*{
		margin:0;
		padding:0;
		box-sizing:border-box;
		
		
	}



	.header{
		width:100%;
		height:50px;
		background-color:blue;
		display:flex;
		justify-content:space-around;
		align-items:center;
	}

	.header h1{
		font-size:30px;
		color:white;
		font-style:italic;
		
	}

	nav{
		width:20%;
		display:flex;
		justify-content:space-between;
	}

	nav a{
		font-size:20px;
		text-decoration:none;
		color:white;
	}



	.form{
		width:300px;
		height:350px;
		margin:0 auto;
		border:none;
		border-radius:20px 10px 20px 10px;
		box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px;
		padding:20px;
		margin-top:50px;
		transform: translateX(200px);
	}

	.form label{
		 font-stretch: ultra-expanded;
		 font-size:18px;
		 font-style:italic;
		margin-bottom:10px;
	}
	.form input{
		border:none;
		border-bottom:1px solid green;
		box-shadow: rgba(0, 0, 0, 0.1) 0px 4px 12px;
		margin-bottom:10px;
		text-align:center;
	}

	.btn-success{
		margin-top:15px;
		border-radius:8px 10px 8px 10px;
	}





}
