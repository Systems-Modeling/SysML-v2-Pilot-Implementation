import unittest
from ..bnf_grammar import bnf_grammar_processor as bgp

class TestRenderNestedLists(unittest.TestCase):

    def test_render_nested_lists(self):
        html_snippet = "<ol><li>One</li><li>Two<ul><li>Two sub one</li><li>Two sub two</li></ul>Two continued</li></ol>"
        self.assertEqual(bgp.render_nested_lists(html_snippet, bgp.RenderMode.TXT, False), """\
  1. One
  2. Two
    • Two sub one
    • Two sub two
  Two continued""")

        self.assertEqual(bgp.render_nested_lists(html_snippet, bgp.RenderMode.TXT, True), """\
//   1. One
//   2. Two
//     • Two sub one
//     • Two sub two
//   Two continued""")

        self.assertEqual(bgp.render_nested_lists(html_snippet, bgp.RenderMode.HTML, False), """\
<ol>
<li>1. One</li>
<li>2. Two
<ul>
<li>• Two sub one</li>
<li>• Two sub two</li>
</ul>
Two continued</li>
</ol>
""")

        self.assertEqual(bgp.render_nested_lists(html_snippet, bgp.RenderMode.HTML, True), """\
<ol>
<li>// 1. One</li>
<li>// 2. Two
<ul>
<li>// • Two sub one</li>
<li>// • Two sub two</li>
</ul>
// Two continued</li>
</ol>
""")

# if __name__ == '__main__':
#     unittest.main()
