#include <bits/stdc++.h>
using namespace std;
int main()
{

	int n, k;
	cin>>n;
	int i, c0 = 0, c5 = 0;
	for (i = 0; i < n; i++) {
        cin>>k;
		if (k == 0)
			c0++;
		else
			c5++;
	}

	c5 = floor(c5 / 9) * 9;
	if (c0 == 0)
		cout << -1;
	else if (c5 == 0)
		cout << 0;
	else {
		for (i = 0; i < c5; i++)
			cout << 5;
		for (i = 0; i < c0; i++)
			cout << 0;
	}

	return 0;
}
