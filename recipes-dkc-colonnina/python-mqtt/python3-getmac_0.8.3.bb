
SUMMARY = "Get MAC addresses of remote hosts and local interfaces"
HOMEPAGE = "https://github.com/GhostofGoes/getmac"
AUTHOR = "Christopher Goes <ghostofgoes@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=49206937513d48371c7b19babc4ec77f"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/66/9b/a23f8ea858716fe9969190f6dbfb2b7680039079b8eec0c7a7fb3be48a42/getmac-0.8.3.tar.gz"
SRC_URI[md5sum] = "72f6cfd449fb65bbbbbb1dfc863e6d20"
SRC_URI[sha256sum] = "6e38f9023b9792f53ef982cce6be65d84fea656be87100ab2f2d0376563af486"

S = "${WORKDIR}/getmac-0.8.3"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
