from html import escape
from pathlib import Path

machines = {
    "main": {
        "os": "windows 11",
        "host": "galaxy book 3 360",
        "wm": "autohotkey + altsnap",
        "editor": "zed",
        "browser": "helium",
        "notes": "obsidian",
    },
    "server": {
        "os": "fedora",
        "host": "hp laptop 15s-fq2xxx",
        "torrent": "qbittorrent + gluetun",
        "git": "forgejo",
        "media": "jellyfin",
        "sync": "webdav",
    },
}
quote = '"abandon your fear. look forward. move forward and never stop."'

bg, fg = "#2E3440", "#D8DEE9"
nord = ["#8FBCBB", "#88C0D0", "#81A1C1", "#5E81AC", "#BF616A", "#D08770", "#EBCB8B", "#A3BE8C", "#B48EAD"]

style = f"""
text{{font:14px monospace;fill:{fg}}}
.b{{font-weight:bold}}
"""

ch, lh, pad, gap = 8.4, 22, 24, 4
key = max(len(k) for m in machines.values() for k in m) + 2
col = key + max(len(v) for m in machines.values() for v in m.values())
rows = max(map(len, machines.values()))

top = pad + 12
rule = top + 8
body = rule + 24
foot = body + lh * (rows + 1)
bar = foot + 18
w = round(2 * pad + ch * max(len(machines) * (col + gap) - gap, len(quote)))
h = bar + 6 + pad

out = []
for i, (name, items) in enumerate(machines.items()):
    x = round(pad + ch * i * (col + gap))
    out += [
        f'<text class="b" x="{x}" y="{top}">{escape(name)}</text>',
        f'<rect x="{x}" y="{rule}" width="{round(ch * col)}" height="2" fill="{fg}"/>',
    ]
    for j, (k, v) in enumerate(items.items()):
        y = body + lh * j
        out += [
            f'<text x="{x}" y="{y}">{escape(k)}</text>',
            f'<text x="{round(x + ch * key)}" y="{y}">{escape(v)}</text>',
        ]
out.append(f'<text x="{pad}" y="{foot}">{escape(quote)}</text>')

edges = [round(pad + (w - 2 * pad) * i / len(nord)) for i in range(len(nord) + 1)]
out += [f'<rect x="{a}" y="{bar}" width="{b - a}" height="6" fill="{c}"/>' for a, b, c in zip(edges, edges[1:], nord)]

svg = "\n".join([
    f'<svg xmlns="http://www.w3.org/2000/svg" width="{w}" height="{h}" viewBox="0 0 {w} {h}">',
    f"<style>{style}</style>",
    f'<rect width="{w}" height="{h}" fill="{bg}"/>',
    *out,
    "</svg>\n",
])

Path(__file__).with_name("specs.svg").write_text(svg, encoding="utf-8", newline="\n")
