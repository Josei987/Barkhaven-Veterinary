(function () {
    const storageKey = 'barkhaven-theme';
    const isDark = localStorage.getItem(storageKey) === 'dark';

    document.body.classList.toggle('dark', isDark);

    document.addEventListener('DOMContentLoaded', function () {
        const toggle = document.getElementById('dark-mode');

        if (!toggle) return;

        toggle.checked = document.body.classList.contains('dark');
        toggle.addEventListener('change', function () {
            const enabled = toggle.checked;
            document.body.classList.toggle('dark', enabled);
            localStorage.setItem(storageKey, enabled ? 'dark' : 'light');
        });
    });
})();