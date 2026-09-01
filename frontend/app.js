document.getElementById('testBtn').addEventListener('click', () => {
    fetch('http://localhost:8080/api/hello')
        .then(response => response.text())
        .then(data => {
            document.getElementById('resultText').innerText = data;
        })

        .catch (error => {
            console.error('Error fetching data', error);
            document.getElementById('resultText').innerText = 'Failed to connect to the backend';
        });
});