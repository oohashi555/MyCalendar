import { useState } from 'react';
import './App.css';

function App() {
	const url = "http://localhost:8080/";
	const [data, setData] = useState("");
	async function getData() {
		const response = await fetch(url);
		const data = await response.json();
		const str = JSON.stringify(data, null, ' ');
		setData(str);
	}
	getData();
	
  return (
    <div className="App">
      <h1>React app.</h1>
      <pre>{data}</pre>
    </div>
  );
}

export default App;
