<h2><a href="https://leetcode.com/problems/maximum-matrix-sum/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1975. Maximum Matrix Sum</a></h2><h3>Medium</h3><hr><div><p>You are given an <code>n x n</code> integer <code>matrix</code>. You can do the following operation <strong>any</strong> number of times:</p>

<ul>
	<li>Choose any two <strong>adjacent</strong> elements of <code>matrix</code> and <strong>multiply</strong> each of them by <code>-1</code>.</li>
</ul>

<p>Two elements are considered <strong>adjacent</strong> if and only if they share a <strong>border</strong>.</p>

<p>Your goal is to <strong>maximize</strong> the summation of the matrix's elements. Return <em>the <strong>maximum</strong> sum of the matrix's elements using the operation mentioned above.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/16/pc79-q2ex1.png" style="width: 401px; height: 81px;">
<pre><strong>Input:</strong> matrix = [[1,-1],[-1,1]]
<strong>Output:</strong> 4
<b>Explanation:</b> We can follow the following steps to reach sum equals 4:
- Multiply the 2 elements in the first row by -1.
- Multiply the 2 elements in the first column by -1.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/16/pc79-q2ex2.png" style="width: 321px; height: 121px;">
<pre><strong>Input:</strong> matrix = [[1,2,3],[-1,-2,-3],[1,2,3]]
<strong>Output:</strong> 16
<b>Explanation:</b> We can follow the following step to reach sum equals 16:
- Multiply the 2 last elements in the second row by -1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == matrix.length == matrix[i].length</code></li>
	<li><code>2 &lt;= n &lt;= 250</code></li>
	<li><code>-10<sup>5</sup> &lt;= matrix[i][j] &lt;= 10<sup>5</sup></code></li>
</ul>
</div>