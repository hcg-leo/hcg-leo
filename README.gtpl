<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:2E3440,100:3B4252&height=200&section=header&text=hcg-leo&fontSize=60&fontAlignY=35&fontColor=88C0D0&animation=fadeIn&desc=leo%20the%20cat&descAlignY=55&descSize=18" />
</p>

### github stats

[![Metrics](https://github.com/hcg-leo/hcg-leo/raw/main/github-metrics.svg)](https://github.com/hcg-leo/hcg-leo/blob/main/github-metrics.svg)

### my latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### recent stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### how to reach me

<!--
- email: aran20111118 [at] gmail [dot] com
- discord: hcg_leo
-->
